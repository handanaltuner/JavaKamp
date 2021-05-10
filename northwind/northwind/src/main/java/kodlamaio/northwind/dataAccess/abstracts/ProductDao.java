package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.conctretes.Product;


public interface ProductDao extends JpaRepository <Product,Integer> {

}


//lombok.java hata verdiğinde eclips dosyaları açılmadığında 
//ecplips.ini dosyasında en aşağıda -javaagent:lombok.jar benzeri bir uzantı silinirse eclips açılıyor.