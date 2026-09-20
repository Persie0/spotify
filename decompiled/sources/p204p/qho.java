package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public interface qho {
    /* JADX INFO: renamed from: a */
    default qho m72837a(gh00 gh00Var) {
        if (this instanceof oho) {
            return new oho(gh00Var.invoke(((oho) this).f165512a), null);
        }
        if ((this instanceof pho) || (this instanceof nho)) {
            return this;
        }
        throw new NoWhenBranchMatchedException();
    }
}
