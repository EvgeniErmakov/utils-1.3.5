package org;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isParsable(str)) {
            return NumberUtils.createDouble(str) > 0;
        }
        // text for testing fetch function();
        return false;
    }
}
