package p204p;

import com.spotify.address.endpoint.model.p012v1.proto.SubmitFormResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class lmt implements qmt {

    /* JADX INFO: renamed from: a */
    public final SubmitFormResponse.Suggestion f135018a;

    public lmt(SubmitFormResponse.Suggestion suggestion) {
        this.f135018a = suggestion;
    }

    /* JADX INFO: renamed from: a */
    public final SubmitFormResponse.Suggestion m59464a() {
        return this.f135018a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmt) && wj50.m88271j(this.f135018a, ((lmt) obj).f135018a);
    }

    public final int hashCode() {
        return this.f135018a.hashCode();
    }
}
