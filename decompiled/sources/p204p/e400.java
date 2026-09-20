package p204p;

import android.content.res.Resources;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class e400 implements h1x0 {

    /* JADX INFO: renamed from: a */
    public final int f55913a;

    /* JADX INFO: renamed from: b */
    public final Object[] f55914b;

    public e400(int i, Object... objArr) {
        this.f55913a = i;
        this.f55914b = objArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e400)) {
            return false;
        }
        e400 e400Var = (e400) obj;
        return this.f55913a == e400Var.f55913a && Arrays.equals(this.f55914b, e400Var.f55914b);
    }

    public final int hashCode() {
        return this.f55913a;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object[] objArr = this.f55914b;
        return ((Resources) obj).getString(this.f55913a, Arrays.copyOf(objArr, objArr.length));
    }
}
