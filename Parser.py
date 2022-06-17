from utils.jcpParser import jcpParser

class Parser(jcpParser):
    def __init__(self, input):
        super().__init__(input)


    class LenghtContext(jcpParser.LenghtContext):
        def __init__(self, parser, parent=None, invokingState:int=-1):
            super().__init__(parser, parent, invokingState)
            self.parser = parser

        def getText(self):
            return 'sizeof('+self.fieldAccess().getText()+')/sizeof('+self.fieldAccess().getText()+'[0])'

    def lenght(self):

        localctx = self.LenghtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 114, self.RULE_lenght)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 527
            self.fieldAccess()
            self.state = 528
            self.match(jcpParser.DOT)
            self.state = 529
            self.match(jcpParser.LENGHT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx
