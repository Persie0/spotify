package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class ume0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f231843a;

    /* JADX INFO: renamed from: b */
    public final int f231844b;

    /* JADX INFO: renamed from: c */
    public final String f231845c;

    public ume0(String str, int i, String str2) {
        this.f231843a = str;
        this.f231844b = i;
        this.f231845c = str2;
    }

    private Object readResolve() {
        return new vme0(this.f231843a, this.f231844b, this.f231845c);
    }
}
