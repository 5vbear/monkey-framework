package com.monkeyframework.core.io;

import com.monkeyframework.core.lang.ByteSequence;

import java.io.ByteArrayOutputStream;

/**
 * Exposes internal buffer.
 * 
 * @author Santhosh Kumar T
 * @author Cruise.Xu
 */
public class ByteArrayOutputStream2 extends ByteArrayOutputStream {
   public ByteArrayOutputStream2() {
   }

   public ByteArrayOutputStream2(int size) {
      super(size);
   }

   /**
    * Returns the input data as {@link com.monkeyframework.core.lang.ByteSequence}.
    * <p/>
    * <br>
    * Note that the internal buffer is not copied.
    * 
    * @return internal byte sequence.
    */
   public ByteSequence toByteSequence() {
      return new ByteSequence(buf, 0, size());
   }
}
