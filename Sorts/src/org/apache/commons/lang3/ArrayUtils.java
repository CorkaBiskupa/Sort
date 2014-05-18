package org.apache.commons.lang3;
/*
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.lang3.mutable.MutableInt;
*/
public class ArrayUtils {

	 public static void reverse(Object[] array) {
	        if (array == null) {
	            return;
	        }
	        int i = 0;
	        int j = array.length - 1;
	        Object tmp;
	        while (j > i) {
	            tmp = array[j];
	            array[j] = array[i];
	            array[i] = tmp;
	            j--;
	            i++;
	        }
	    }

	    public static void reverse(long[] array) {
	        if (array == null) {
	            return;
	        }
	        int i = 0;
	        int j = array.length - 1;
	        long tmp;
	        while (j > i) {
	            tmp = array[j];
	            array[j] = array[i];
	            array[i] = tmp;
	            j--;
	            i++;
	        }
	    }

	    public static void reverse(int[] array) {
	        if (array == null) {
	            return;
	        }
	        int i = 0;
	        int j = array.length - 1;
	        int tmp;
	        while (j > i) {
	            tmp = array[j];
	            array[j] = array[i];
	            array[i] = tmp;
	            j--;
	            i++;
	        }
	    }

	    public static void reverse(short[] array) {
	        if (array == null) {
	            return;
	        }
	        int i = 0;
	        int j = array.length - 1;
	        short tmp;
	        while (j > i) {
	            tmp = array[j];
	            array[j] = array[i];
	            array[i] = tmp;
	            j--;
	            i++;
	        }
	    }

	    public static void reverse(char[] array) {
	        if (array == null) {
	            return;
	        }
	        int i = 0;
	        int j = array.length - 1;
	        char tmp;
	        while (j > i) {
	            tmp = array[j];
	            array[j] = array[i];
	            array[i] = tmp;
	            j--;
	            i++;
	        }
	    }

	    /**
	     * <p>Reverses the order of the given array.</p>
	     *
	     * <p>This method does nothing for a {@code null} input array.</p>
	     *
	     * @param array  the array to reverse, may be {@code null}
	     */
	    public static void reverse(byte[] array) {
	        if (array == null) {
	            return;
	        }
	        int i = 0;
	        int j = array.length - 1;
	        byte tmp;
	        while (j > i) {
	            tmp = array[j];
	            array[j] = array[i];
	            array[i] = tmp;
	            j--;
	            i++;
	        }
	    }

	    /**
	     * <p>Reverses the order of the given array.</p>
	     *
	     * <p>This method does nothing for a {@code null} input array.</p>
	     *
	     * @param array  the array to reverse, may be {@code null}
	     */
	    public static void reverse(double[] array) {
	        if (array == null) {
	            return;
	        }
	        int i = 0;
	        int j = array.length - 1;
	        double tmp;
	        while (j > i) {
	            tmp = array[j];
	            array[j] = array[i];
	            array[i] = tmp;
	            j--;
	            i++;
	        }
	    }

	    /**
	     * <p>Reverses the order of the given array.</p>
	     *
	     * <p>This method does nothing for a {@code null} input array.</p>
	     *
	     * @param array  the array to reverse, may be {@code null}
	     */
	    public static void reverse(float[] array) {
	        if (array == null) {
	            return;
	        }
	        int i = 0;
	        int j = array.length - 1;
	        float tmp;
	        while (j > i) {
	            tmp = array[j];
	            array[j] = array[i];
	            array[i] = tmp;
	            j--;
	            i++;
	        }
	    }

	    /**
	     * <p>Reverses the order of the given array.</p>
	     *
	     * <p>This method does nothing for a {@code null} input array.</p>
	     *
	     * @param array  the array to reverse, may be {@code null}
	     */
	    public static void reverse(boolean[] array) {
	        if (array == null) {
	            return;
	        }
	        int i = 0;
	        int j = array.length - 1;
	        boolean tmp;
	        while (j > i) {
	            tmp = array[j];
	            array[j] = array[i];
	            array[i] = tmp;
	            j--;
	            i++;
	        }
	    }

}
