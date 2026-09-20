package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ceo implements heo {

    /* JADX INFO: renamed from: a */
    public final String f37162a;

    public ceo(String str) {
        this.f37162a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ceo) && wj50.m88271j(this.f37162a, ((ceo) obj).f37162a);
    }

    public final int hashCode() {
        return this.f37162a.hashCode();
    }
}
