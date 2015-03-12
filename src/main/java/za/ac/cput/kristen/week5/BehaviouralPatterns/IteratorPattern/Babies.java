package za.ac.cput.kristen.week5.BehaviouralPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kris on 3/11/15.
 */
public class Babies
{
    private List<Word> babywords;

    public Babies()
    {
        babywords = new ArrayList<Word>();
    }

    public void addBabyWord(Word word)
    {
        babywords.add(word);
    }

    public Iterator<Word> iterator()
    {
        return new BabyIterator();
    }

    class BabyIterator implements Iterator<Word>
    {
        int curIndex = 0;

        @Override
        public boolean hasNext()
        {
            if (curIndex >= babywords.size())
                return false;
            else
                return true;
        }

        @Override
        public Word next() {
            return babywords.get(curIndex++);
        }

        @Override
        public void remove() {
            babywords.remove(--curIndex);
        }
    }
}
