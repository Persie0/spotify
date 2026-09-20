package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qti0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final String f192387a;

    /* JADX INFO: renamed from: b */
    public final boolean f192388b;

    public qti0(String str, boolean z) {
        if (str == null) {
            m73839a(0);
            throw null;
        }
        this.f192387a = str;
        this.f192388b = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m73839a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: d */
    public static qti0 m73840d(String str) {
        if (str != null) {
            return str.startsWith("<") ? m73843g(str) : m73841e(str);
        }
        m73839a(9);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static qti0 m73841e(String str) {
        if (str != null) {
            return new qti0(str, false);
        }
        m73839a(5);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m73842f(String str) {
        if (str == null) {
            m73839a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static qti0 m73843g(String str) {
        if (str == null) {
            m73839a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new qti0(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    /* JADX INFO: renamed from: b */
    public final String m73844b() {
        String str = this.f192387a;
        if (str != null) {
            return str;
        }
        m73839a(1);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final String m73845c() {
        if (this.f192388b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strM73844b = m73844b();
        if (strM73844b != null) {
            return strM73844b;
        }
        m73839a(2);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f192387a.compareTo(((qti0) obj).f192387a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qti0)) {
            return false;
        }
        qti0 qti0Var = (qti0) obj;
        return this.f192388b == qti0Var.f192388b && this.f192387a.equals(qti0Var.f192387a);
    }

    public final int hashCode() {
        return (this.f192387a.hashCode() * 31) + (this.f192388b ? 1 : 0);
    }

    public final String toString() {
        return this.f192387a;
    }
}
