package p204p;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class id91 {

    /* JADX INFO: renamed from: e */
    public static volatile hao f100987e;

    /* JADX INFO: renamed from: a */
    public final wre f100988a;

    /* JADX INFO: renamed from: b */
    public final wre f100989b;

    /* JADX INFO: renamed from: c */
    public final zfy0 f100990c;

    /* JADX INFO: renamed from: d */
    public final rvw0 f100991d;

    public id91(wre wreVar, wre wreVar2, zfy0 zfy0Var, rvw0 rvw0Var, be41 be41Var) {
        this.f100988a = wreVar;
        this.f100989b = wreVar2;
        this.f100990c = zfy0Var;
        this.f100991d = rvw0Var;
        be41Var.m28902w();
    }

    /* JADX INFO: renamed from: a */
    public static id91 m50308a() {
        hao haoVar = f100987e;
        if (haoVar != null) {
            return (id91) haoVar.f89258f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX INFO: renamed from: b */
    public static void m50309b(Context context) {
        if (f100987e == null) {
            synchronized (id91.class) {
                try {
                    if (f100987e == null) {
                        gao gaoVarM86748m = vyf1.m86748m();
                        gaoVarM86748m.m44178d(context);
                        f100987e = gaoVarM86748m.m44176a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final gd91 m50310c(zdu zduVar) {
        byte[] bytes;
        Set setUnmodifiableSet = zduVar != null ? Collections.unmodifiableSet(nva.f158846d) : Collections.singleton(new keu("proto"));
        c06 c06VarM79891a = t28.m79891a();
        zduVar.getClass();
        c06VarM79891a.m31088E("cct");
        nva nvaVar = (nva) zduVar;
        String str = nvaVar.f158849a;
        String str2 = nvaVar.f158850b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = edb.m38566o("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        c06VarM79891a.m31091H(bytes);
        return new gd91(setUnmodifiableSet, c06VarM79891a.m31099k(), this);
    }
}
