**[How To Use Spring Boot Offset Pagination And `List<dto>`](https://github.com/AnghelLeonard/Hibernate-SpringBoot/tree/master/HibernateSpringBootListDtoOffsetPagination)**

**Description:** This application fetches data as `List<dto>` via Spring Boot offset pagination. Most of the time, the data that should be paginated is *read-only* data. Fetching the data into entities should be done only if we plan to modify that data, therefore, fetching *read only* data as `List<entity>` is not preferable since it may end up in a significant performance penalty.
 
**Key points:**\
     - create a Spring projection (DTO) to contains getters only for the data that should be fetched\
     - write a repository that extends `PagingAndSortingRepository`\
     - fetch data via a JPQL or native query (that includes counting) into a `List<dto>`

-------------------------------

**You may like to try as well:**
<a href="https://leanpub.com/java-persistence-performance-illustrated-guide"><p align="center"><img src="https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/Java%20Persistence%20Performance%20Illustrated%20Guide.jpg" height="410" width="350"/></p></a>