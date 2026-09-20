package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class f41 extends i41 {

    /* JADX INFO: renamed from: a */
    public final Intent f65630a;

    public f41(Intent intent) {
        this.f65630a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f41) && wj50.m88271j(this.f65630a, ((f41) obj).f65630a);
    }

    public final int hashCode() {
        return this.f65630a.hashCode();
    }
}
