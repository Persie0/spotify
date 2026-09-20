package p196j$.desugar.sun.nio.p197fs;

import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p196j$.nio.file.AbstractC1475h;
import p196j$.nio.file.C1488n0;
import p196j$.nio.file.InterfaceC1470e0;
import p196j$.nio.file.Path;
import p196j$.nio.file.attribute.C1437b0;
import p196j$.nio.file.spi.AbstractC1496c;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.i */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1421i extends AbstractC1475h {

    /* JADX INFO: renamed from: a */
    public final String f10483a;

    /* JADX INFO: renamed from: b */
    public final String f10484b;

    /* JADX INFO: renamed from: c */
    public final C1425m f10485c;

    public C1421i(C1425m c1425m, String str, String str2) {
        this.f10485c = c1425m;
        this.f10483a = str;
        this.f10484b = str2;
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: a */
    public final Iterable mo23845a() {
        throw new UnsupportedOperationException("");
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: b */
    public final Path mo23846b(String str, String[] strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
            }
            str = sb.toString();
        }
        return new C1427o(this, str, this.f10483a, this.f10484b);
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0102  */
    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: c */
    public final InterfaceC1470e0 mo23847c(String str) {
        char c;
        int i;
        int iIndexOf = str.indexOf(58);
        if (iIndexOf <= 0 || iIndexOf == str.length()) {
            throw new IllegalArgumentException(String.format("Requested <syntax>:<pattern> spliterator(':') position(%d) is out of bound in %s", Integer.valueOf(iIndexOf), str));
        }
        char c2 = 0;
        String strSubstring = str.substring(0, iIndexOf);
        char c3 = 1;
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring.equalsIgnoreCase("glob")) {
            StringBuilder sb = new StringBuilder("^");
            int i2 = 0;
            char c4 = 0;
            while (i2 < strSubstring2.length()) {
                int i3 = i2 + 1;
                char cCharAt = strSubstring2.charAt(i2);
                if (cCharAt != '*') {
                    if (cCharAt == ',') {
                        c = c3;
                        if (c4 != 0) {
                            sb.append(")|(?:");
                        } else {
                            sb.append(',');
                        }
                    } else if (cCharAt == '/') {
                        c = c3;
                        sb.append(cCharAt);
                    } else if (cCharAt == '?') {
                        c = c3;
                        sb.append("[^/]");
                    } else if (cCharAt == '{') {
                        c = c3;
                        if (c4 != 0) {
                            throw new PatternSyntaxException("Cannot nest groups", strSubstring2, i2);
                        }
                        sb.append("(?:(?:");
                        i2 = i3;
                        c4 = c;
                    } else if (cCharAt == '}') {
                        c = c3;
                        if (c4 != 0) {
                            sb.append("))");
                            i2 = i3;
                            c4 = 0;
                        } else {
                            sb.append('}');
                        }
                    } else if (cCharAt == '[') {
                        sb.append("[[^/]&&[");
                        if (AbstractC1419g.m23839v(strSubstring2, i3) == '^') {
                            sb.append("\\^");
                            i2 += 2;
                        } else {
                            if (AbstractC1419g.m23839v(strSubstring2, i3) == '!') {
                                sb.append('^');
                                i3 = i2 + 2;
                            }
                            if (AbstractC1419g.m23839v(strSubstring2, i3) == '-') {
                                sb.append('-');
                                i2 = i3 + 1;
                            } else {
                                i2 = i3;
                            }
                        }
                        char c5 = c2;
                        char c6 = c5;
                        while (true) {
                            if (i2 >= strSubstring2.length()) {
                                c = c3;
                                break;
                            }
                            int i4 = i2 + 1;
                            char cCharAt2 = strSubstring2.charAt(i2);
                            if (cCharAt2 == ']') {
                                c = c3;
                                i2 = i4;
                                cCharAt = cCharAt2;
                                break;
                            }
                            if (cCharAt2 == '/') {
                                throw new PatternSyntaxException("Explicit 'name separator' in class", strSubstring2, i2);
                            }
                            if (cCharAt2 == '\\' || cCharAt2 == '[') {
                                c = c3;
                            } else {
                                c = c3;
                                if (cCharAt2 == '&' && AbstractC1419g.m23839v(strSubstring2, i4) == '&') {
                                }
                                sb.append(cCharAt2);
                                if (cCharAt2 != '-') {
                                    i2 = i4;
                                    cCharAt = cCharAt2;
                                    c6 = cCharAt;
                                    c3 = c;
                                    c5 = c3;
                                } else {
                                    if (c5 != 0) {
                                        throw new PatternSyntaxException("Invalid range", strSubstring2, i2);
                                    }
                                    i = i2 + 2;
                                    cCharAt = AbstractC1419g.m23839v(strSubstring2, i4);
                                    if (cCharAt != 0 || cCharAt == ']') {
                                        i2 = i;
                                        break;
                                    }
                                    if (cCharAt < c6) {
                                        throw new PatternSyntaxException("Invalid range", strSubstring2, i2 - 1);
                                    }
                                    sb.append(cCharAt);
                                    i2 = i;
                                    c3 = c;
                                    c5 = 0;
                                }
                            }
                            sb.append('\\');
                            sb.append(cCharAt2);
                            if (cCharAt2 != '-') {
                                if (c5 != 0) {
                                    throw new PatternSyntaxException("Invalid range", strSubstring2, i2);
                                }
                                i = i2 + 2;
                                cCharAt = AbstractC1419g.m23839v(strSubstring2, i4);
                                if (cCharAt != 0) {
                                }
                                i2 = i;
                                break;
                            }
                            i2 = i4;
                            cCharAt = cCharAt2;
                            c6 = cCharAt;
                            c3 = c;
                            c5 = c3;
                        }
                        if (cCharAt != ']') {
                            throw new PatternSyntaxException("Missing ']", strSubstring2, i2 - 1);
                        }
                        sb.append("]]");
                    } else if (cCharAt != '\\') {
                        if (".^$+{[]|()".indexOf(cCharAt) != -1) {
                            sb.append('\\');
                        }
                        sb.append(cCharAt);
                        c = c3;
                    } else {
                        if (i3 == strSubstring2.length()) {
                            throw new PatternSyntaxException("No character to escape", strSubstring2, i2);
                        }
                        i2 += 2;
                        char cCharAt3 = strSubstring2.charAt(i3);
                        if ("\\*?[{".indexOf(cCharAt3) != -1 || ".^$+{[]|()".indexOf(cCharAt3) != -1) {
                            sb.append('\\');
                        }
                        sb.append(cCharAt3);
                        c = c3;
                    }
                    i2 = i3;
                } else {
                    c = c3;
                    if (AbstractC1419g.m23839v(strSubstring2, i3) == '*') {
                        sb.append(".*");
                        i2 += 2;
                    } else {
                        sb.append("[^/]*");
                        i2 = i3;
                    }
                }
                c3 = c;
                c2 = 0;
            }
            if (c4 != 0) {
                throw new PatternSyntaxException("Missing '}", strSubstring2, i2 - 1);
            }
            sb.append('$');
            strSubstring2 = sb.toString();
        } else if (!strSubstring.equalsIgnoreCase("regex")) {
            throw new UnsupportedOperationException("Syntax '" + strSubstring + "' not recognized");
        }
        return new C1420h(Pattern.compile(strSubstring2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: d */
    public final Iterable mo23848d() {
        return AbstractC1419g.m23830m(new Object[]{new C1427o(this, "/", this.f10483a, this.f10484b)});
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: e */
    public final String mo23849e() {
        return "/";
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: f */
    public final C1437b0 mo23850f() {
        throw new UnsupportedOperationException();
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: g */
    public final boolean mo23851g() {
        return false;
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: h */
    public final C1488n0 mo23852h() {
        throw new UnsupportedOperationException();
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: i */
    public final AbstractC1496c mo23853i() {
        return this.f10485c;
    }

    @Override // p196j$.nio.file.AbstractC1475h
    public final boolean isOpen() {
        return true;
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: j */
    public final Set mo23854j() {
        return AbstractC1419g.m23831n(new Object[]{"basic"});
    }
}
