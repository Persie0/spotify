package p204p;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class bhw implements jn91 {

    /* JADX INFO: renamed from: a */
    public final chw f27248a;

    /* JADX INFO: renamed from: b */
    public final String[] f27249b;

    /* JADX INFO: renamed from: c */
    public final String f27250c;

    public bhw(chw chwVar, String... strArr) {
        this.f27248a = chwVar;
        this.f27249b = strArr;
        String str = chwVar.f38123a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f27250c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: G */
    public final qge mo25169G() {
        ehw.f59682a.getClass();
        return ehw.f59684c;
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: I */
    public final boolean mo25170I() {
        return false;
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: e */
    public final List mo25171e() {
        return lau.f131415a;
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: f */
    public final Collection mo25172f() {
        return lau.f131415a;
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: g */
    public final ib70 mo25173g() {
        return (e1p) e1p.f55232f.getValue();
    }

    public final String toString() {
        return this.f27250c;
    }
}
