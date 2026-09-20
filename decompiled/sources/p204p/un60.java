package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class un60 {

    /* JADX INFO: renamed from: a */
    public final String f232069a;

    public un60(String str) {
        if (str != null) {
            this.f232069a = str;
        } else {
            m83529a(7);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m83529a(int i) {
        String str;
        int i2;
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i != 5) {
            switch (i) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static un60 m83530b(y400 y400Var) {
        if (y400Var != null) {
            return new un60(y400Var.f269048a.f279080a.replace('.', '/'));
        }
        m83529a(4);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static un60 m83531c(String str) {
        if (str != null) {
            return new un60(str);
        }
        m83529a(0);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static String m83532e(vfe vfeVar) {
        y400 y400Var = vfeVar.f240966a;
        String strReplace = vfeVar.f240967b.f269048a.f279080a.replace('.', '$');
        if (!y400Var.f269048a.m95303c()) {
            strReplace = y400Var.f269048a.f279080a.replace('.', '/') + "/" + strReplace;
        }
        if (strReplace != null) {
            return strReplace;
        }
        m83529a(3);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final String m83533d() {
        String str = this.f232069a;
        if (str != null) {
            return str;
        }
        m83529a(10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || un60.class != obj.getClass()) {
            return false;
        }
        return this.f232069a.equals(((un60) obj).f232069a);
    }

    public final int hashCode() {
        return this.f232069a.hashCode();
    }

    public final String toString() {
        return this.f232069a;
    }
}
