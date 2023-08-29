package atividade01;

public class Busca implements Busca_IF {

	@Override
	public int[] geraVetorNumericoOrdenado(int tamanho) {
		int vetor[]= new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			vetor[i]=i+1;
			
		}
		return vetor;
	}

	@Override
	public boolean buscaLinear_iterativa(int[] numeros, int k) {
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]==k) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean buscaLinear_recursiva(int[] numeros, int k ) {
		
	
		  return buscaLinearDuplaRecursiva(numeros, k, 0, numeros.length - 1);
    }
	
    private static boolean buscaLinearDuplaRecursiva(int[] array, int elemento, int inicio, int fim) {
        if (inicio > fim) {
            return false; 
        }

        if (array[inicio] == elemento || array[fim] == elemento) {
            return true; 
        }

        
        return buscaLinearDuplaRecursiva(array, elemento, inicio + 1, fim - 1);
    }

	@Override
	public boolean buscaLinear_iterativa_duasPontas(int[] numeros, int k) {
		int inicio=numeros[0];
		int fim=numeros.length-1;
		while(inicio<=fim) {
			if (numeros[inicio]==k||numeros[fim]==k) {
				return true;
			}
			inicio++;
			fim--;
			
		}
		return false;
	}

	@Override
	public boolean buscaBinaria_iterativa(int[] numeros, int k) {
		int inicio=0;
		int fim=numeros.length-1;
		int meio;
		while(fim<=inicio) {
			meio=(inicio+fim)/2;	
			if(numeros[meio]==k) {
				return true;
			}else if(numeros[meio]<k) {
				inicio=meio+1;
			}else {
				fim=meio-1;
			}
		}
		return false;
	}

	@Override
	public boolean buscaBinaria_recursiva(int[] numeros, int k) {
		
		return buscaBinariaRecursiva(numeros, k, 0, numeros.length - 1);
	}
	   private static boolean buscaBinariaRecursiva(int[] array, int elemento, int inicio, int fim) {
	        if (inicio <= fim) {
	            int meio = (inicio + fim) / 2;

	            if (array[meio] == elemento) {
	                return  true; 
	            } else if (array[meio] < elemento) {
	                return buscaBinariaRecursiva(array, elemento, meio + 1, fim); 
	            } else {
	                return buscaBinariaRecursiva(array, elemento, inicio, meio - 1); 
	                }
	        }

	        return false;
	    }

}
