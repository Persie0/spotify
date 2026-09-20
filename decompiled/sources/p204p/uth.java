package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uth {

    /* JADX INFO: renamed from: a */
    public final String f233922a;

    /* JADX INFO: renamed from: b */
    public final String f233923b;

    public uth(String str, String str2) {
        this.f233922a = str;
        this.f233923b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uth)) {
            return false;
        }
        uth uthVar = (uth) obj;
        return wj50.m88271j(this.f233922a, uthVar.f233922a) && wj50.m88271j(this.f233923b, uthVar.f233923b);
    }

    public final int hashCode() {
        return this.f233923b.hashCode() + (this.f233922a.hashCode() * 31);
    }
}
