package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class io91 extends ho91 {

    /* JADX INFO: renamed from: a */
    public final int f104161a;

    /* JADX INFO: renamed from: b */
    public final gd70 f104162b;

    public io91(int i, gd70 gd70Var) {
        if (i == 0) {
            m51152e(0);
            throw null;
        }
        if (gd70Var == null) {
            m51152e(1);
            throw null;
        }
        this.f104161a = i;
        this.f104162b = gd70Var;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m51152e(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p204p.ho91
    /* JADX INFO: renamed from: a */
    public final int mo48022a() {
        int i = this.f104161a;
        if (i != 0) {
            return i;
        }
        m51152e(4);
        throw null;
    }

    @Override // p204p.ho91
    /* JADX INFO: renamed from: b */
    public final gd70 mo48023b() {
        gd70 gd70Var = this.f104162b;
        if (gd70Var != null) {
            return gd70Var;
        }
        m51152e(5);
        throw null;
    }

    @Override // p204p.ho91
    /* JADX INFO: renamed from: c */
    public final boolean mo48024c() {
        return false;
    }

    @Override // p204p.ho91
    /* JADX INFO: renamed from: d */
    public final ho91 mo48025d(ld70 ld70Var) {
        if (ld70Var != null) {
            return new io91(this.f104161a, this.f104162b);
        }
        m51152e(6);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public io91(gd70 gd70Var) {
        this(1, gd70Var);
        if (gd70Var != null) {
        } else {
            m51152e(2);
            throw null;
        }
    }
}
