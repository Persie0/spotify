package p204p;

import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class yyd0 {

    /* JADX INFO: renamed from: a */
    public final am71 f277473a;

    /* JADX INFO: renamed from: b */
    public final String f277474b;

    /* JADX INFO: renamed from: c */
    public final String f277475c;

    /* JADX INFO: renamed from: d */
    public final String f277476d;

    /* JADX INFO: renamed from: e */
    public final String f277477e;

    /* JADX INFO: renamed from: f */
    public final String f277478f;

    /* JADX INFO: renamed from: g */
    public final String f277479g;

    /* JADX INFO: renamed from: h */
    public final String f277480h;

    /* JADX INFO: renamed from: i */
    public sr4 f277481i;

    /* JADX INFO: renamed from: j */
    public String f277482j;

    public yyd0(am71 am71Var, int i, boolean z) {
        String str;
        this.f277473a = am71Var;
        if (i == 1) {
            str = "image";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "video";
        }
        this.f277474b = str;
        this.f277475c = s571.m77251j(z ? "chat_optimistic_" : "chat_", str, "_upload");
        this.f277476d = str.concat("_transcode");
        this.f277477e = str.concat("_initiate_upload");
        this.f277478f = str.concat("_file_upload");
        this.f277479g = str.concat("_submit");
        this.f277480h = str.concat("_count");
    }

    /* JADX INFO: renamed from: a */
    public final void m94887a() {
        sr4 sr4Var = this.f277481i;
        if (sr4Var != null) {
            sr4Var.m79016f(this.f277479g);
        }
        this.f277482j = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m94888b(int i) {
        String strConcat;
        sr4 sr4Var = this.f277481i;
        if (sr4Var != null) {
            String str = this.f277482j;
            if (str != null) {
                sr4Var.m79016f(str);
            }
            int iM38547C = edb.m38547C(i);
            String str2 = this.f277474b;
            if (iM38547C == 0) {
                strConcat = str2.concat("_upload_success");
            } else if (iM38547C == 1) {
                strConcat = str2.concat("_transcode_failed");
            } else if (iM38547C == 2) {
                strConcat = str2.concat("_initiate_upload_failed");
            } else if (iM38547C == 3) {
                strConcat = str2.concat("_file_upload_failed");
            } else if (iM38547C == 4) {
                strConcat = str2.concat("_submit_failed");
            } else {
                if (iM38547C != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                strConcat = str2.concat("_upload_cancelled");
            }
            sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, strConcat);
            ((rr4) this.f277473a).m76276b(sr4Var.m79015d());
        }
        this.f277481i = null;
        this.f277482j = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m94889c(int i) {
        sr4 sr4VarM76275a = ((rr4) this.f277473a).m76275a(this.f277475c);
        sr4VarM76275a.f213231f = "android-campfire-media-upload";
        sr4VarM76275a.m79013a(this.f277480h, String.valueOf(i));
        sr4VarM76275a.m79019k(this.f277476d, null, (4 & 4) != 0);
        this.f277481i = sr4VarM76275a;
        this.f277482j = this.f277476d;
    }
}
