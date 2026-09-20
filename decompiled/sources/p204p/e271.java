package p204p;

import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes3.dex */
public final class e271 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f55383a;

    /* JADX INFO: renamed from: b */
    public final long f55384b;

    /* JADX INFO: renamed from: c */
    public final TextClassification f55385c;

    public e271(CharSequence charSequence, long j, TextClassification textClassification) {
        this.f55383a = charSequence;
        this.f55384b = j;
        this.f55385c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e271)) {
            return false;
        }
        e271 e271Var = (e271) obj;
        return wj50.m88271j(this.f55383a, e271Var.f55383a) && ic71.m50235c(this.f55384b, e271Var.f55384b) && wj50.m88271j(this.f55385c, e271Var.f55385c);
    }

    public final int hashCode() {
        int iHashCode = this.f55383a.hashCode() * 31;
        int i = ic71.f100751c;
        return this.f55385c.hashCode() + dq60.m36605e(iHashCode, this.f55384b, 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f55383a) + ", selection=" + ((Object) ic71.m50241i(this.f55384b)) + ", textClassification=" + this.f55385c + ')';
    }
}
