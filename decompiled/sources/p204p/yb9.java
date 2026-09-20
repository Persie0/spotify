package p204p;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class yb9 {

    /* JADX INFO: renamed from: b */
    public static final String f271105b;

    /* JADX INFO: renamed from: c */
    public static final String f271106c;

    /* JADX INFO: renamed from: d */
    public static final yb9 f271107d;

    /* JADX INFO: renamed from: e */
    public static final yb9 f271108e;

    /* JADX INFO: renamed from: a */
    public final boolean f271109a;

    static {
        ihk0 ihk0Var = l571.f129845c;
        f271105b = Character.toString((char) 8206);
        f271106c = Character.toString((char) 8207);
        f271107d = new yb9(false);
        f271108e = new yb9(true);
    }

    public yb9(boolean z) {
        ihk0 ihk0Var = l571.f129843a;
        this.f271109a = z;
    }

    /* JADX INFO: renamed from: a */
    public static int m93253a(CharSequence charSequence) {
        byte directionality;
        xb9 xb9Var = new xb9(charSequence);
        xb9Var.f259869c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = xb9Var.f259869c;
            if (i4 < xb9Var.f259868b && i == 0) {
                CharSequence charSequence2 = xb9Var.f259867a;
                char cCharAt = charSequence2.charAt(i4);
                xb9Var.f259870d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, xb9Var.f259869c);
                    xb9Var.f259869c = Character.charCount(iCodePointAt) + xb9Var.f259869c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    xb9Var.f259869c++;
                    char c = xb9Var.f259870d;
                    directionality = c < 1792 ? xb9.f259866e[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (xb9Var.f259869c > 0) {
                    switch (xb9Var.m90307a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m93254b(CharSequence charSequence) {
        xb9 xb9Var = new xb9(charSequence);
        xb9Var.f259869c = xb9Var.f259868b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (xb9Var.f259869c > 0) {
                byte bM90307a = xb9Var.m90307a();
                if (bM90307a == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bM90307a == 1 || bM90307a == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bM90307a != 9) {
                    switch (bM90307a) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static yb9 m93255c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? f271108e : f271107d;
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m93256d(CharSequence charSequence) {
        String str;
        ihk0 ihk0Var = l571.f129845c;
        if (charSequence == null) {
            return null;
        }
        boolean zM50655k = ihk0Var.m50655k(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM50655k2 = (zM50655k ? l571.f129844b : l571.f129843a).m50655k(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f271106c;
        String str4 = f271105b;
        boolean z = this.f271109a;
        if (z || !(zM50655k2 || m93253a(charSequence) == 1)) {
            str = (!z || (zM50655k2 && m93253a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zM50655k != z) {
            spannableStringBuilder.append(zM50655k ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM50655k3 = (zM50655k ? l571.f129844b : l571.f129843a).m50655k(charSequence.length(), charSequence);
        if (!z && (zM50655k3 || m93254b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zM50655k3 || m93254b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public final String m93257e(String str) {
        ihk0 ihk0Var = l571.f129843a;
        if (str == null) {
            return null;
        }
        return m93256d(str).toString();
    }
}
