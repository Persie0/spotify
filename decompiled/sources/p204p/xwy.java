package p204p;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class xwy {

    /* JADX INFO: renamed from: a */
    public final mho f266764a;

    /* JADX INFO: renamed from: b */
    public final InputStream f266765b;

    public xwy(mho mhoVar) {
        InputStream inputStreamMo34019p = mhoVar.f143843b.mo34019p();
        this.f266764a = mhoVar;
        this.f266765b = inputStreamMo34019p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwy)) {
            return false;
        }
        xwy xwyVar = (xwy) obj;
        return wj50.m88271j(this.f266764a, xwyVar.f266764a) && wj50.m88271j(this.f266765b, xwyVar.f266765b);
    }

    public final int hashCode() {
        return this.f266765b.hashCode() + (this.f266764a.hashCode() * 31);
    }
}
