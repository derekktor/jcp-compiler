#include <iostream>
class Main {
public:
static void main(std::string args[]) {
std::cout << "Hello World" << std::endl;
}
};

int main() {
	Main::main({});
	return 0;
}
