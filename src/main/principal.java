package main;

import docarmo.pilhaint.pilha;

public class principal {

	public static void main(String[] args) {
		
		System.out.println("Exercicio A começou");
		pilhaA();
		System.out.println("Fim do exercicio A");
		System.out.println("Exercicio B começou");
		pilhaB();
		System.out.println("Fim do exercicio B");
	}

	private static void pilhaA() {
		
		pilha p = new pilha();
        for(int i=0;i<10;i++) {
            if(i%2==0) {
                p.push(i*i);
            }else {
                if(i<=5) {
                    p.push(i);
                } else {
                    try {
                        p.pop();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                int topo = p.top();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int tamanho = p.size();
        System.out.println("O tamanho da pilha:" + tamanho);
        System.out.println("A pilha Ficou:");
        int valor;
        for(int i=0; i<tamanho; i++) {
            try {
                valor=p.top();
                System.out.println(valor);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                p.pop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }		
	}

	private static void pilhaB() {

		pilha p = new pilha();

		for (int i = 100; i < 115; i++) {
			if (p.isEmpty()) {
				p.push(i + 100);
			} else {
				if (p.size() <= 4) {
					p.push(i + 50);
				} else {
					try {
						p.pop();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			try {
				p.top();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		p.size();

		int tamanho = p.size();

		for (int i = 0; i < tamanho; i++) {
			try {
				int valor = p.pop();
				System.out.println(valor);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
