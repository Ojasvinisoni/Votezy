package in.scalive.votezy.repository;

import in.scalive.votezy.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {

    // You can add custom query methods here if needed
}