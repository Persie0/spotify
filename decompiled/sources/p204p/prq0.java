package p204p;

import com.spotify.voiceassistants.playermodels.SpeakeasyDualResponse;

/* JADX INFO: loaded from: classes11.dex */
public final class prq0 {

    /* JADX INFO: renamed from: a */
    public boolean f180659a;

    /* JADX INFO: renamed from: b */
    public boolean f180660b;

    /* JADX INFO: renamed from: c */
    public SpeakeasyDualResponse f180661c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prq0)) {
            return false;
        }
        prq0 prq0Var = (prq0) obj;
        return this.f180659a == prq0Var.f180659a && this.f180660b == prq0Var.f180660b && wj50.m88271j(this.f180661c, prq0Var.f180661c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f180659a) * 31, 31, this.f180660b);
        SpeakeasyDualResponse speakeasyDualResponse = this.f180661c;
        return iM77245d + (speakeasyDualResponse == null ? 0 : speakeasyDualResponse.hashCode());
    }
}
