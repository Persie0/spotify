package p204p;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class bbz {

    /* JADX INFO: renamed from: a */
    public final String f25682a;

    /* JADX INFO: renamed from: b */
    public final String f25683b;

    /* JADX INFO: renamed from: c */
    public final String f25684c;

    /* JADX INFO: renamed from: d */
    public final String f25685d;

    /* JADX INFO: renamed from: e */
    public final String f25686e;

    /* JADX INFO: renamed from: f */
    public final String f25687f;

    /* JADX INFO: renamed from: g */
    public final String f25688g;

    public bbz(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = vl51.f242385a;
        ig31.m50508z("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f25683b = str;
        this.f25682a = str2;
        this.f25684c = str3;
        this.f25685d = str4;
        this.f25686e = str5;
        this.f25687f = str6;
        this.f25688g = str7;
    }

    /* JADX INFO: renamed from: a */
    public static bbz m28651a(Context context) {
        ae41 ae41Var = new ae41(context);
        String strM25678t = ae41Var.m25678t("google_app_id");
        if (TextUtils.isEmpty(strM25678t)) {
            return null;
        }
        return new bbz(strM25678t, ae41Var.m25678t("google_api_key"), ae41Var.m25678t("firebase_database_url"), ae41Var.m25678t("ga_trackingId"), ae41Var.m25678t("gcm_defaultSenderId"), ae41Var.m25678t("google_storage_bucket"), ae41Var.m25678t("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bbz)) {
            return false;
        }
        bbz bbzVar = (bbz) obj;
        return mvl0.m62956s(this.f25683b, bbzVar.f25683b) && mvl0.m62956s(this.f25682a, bbzVar.f25682a) && mvl0.m62956s(this.f25684c, bbzVar.f25684c) && mvl0.m62956s(this.f25685d, bbzVar.f25685d) && mvl0.m62956s(this.f25686e, bbzVar.f25686e) && mvl0.m62956s(this.f25687f, bbzVar.f25687f) && mvl0.m62956s(this.f25688g, bbzVar.f25688g);
    }

    public final int hashCode() {
        return mvl0.m62961x(this.f25683b, this.f25682a, this.f25684c, this.f25685d, this.f25686e, this.f25687f, this.f25688g);
    }

    public final String toString() {
        a9i0 a9i0VarM62936D = mvl0.m62936D(this);
        a9i0VarM62936D.m25120b(this.f25683b, "applicationId");
        a9i0VarM62936D.m25120b(this.f25682a, "apiKey");
        a9i0VarM62936D.m25120b(this.f25684c, "databaseUrl");
        a9i0VarM62936D.m25120b(this.f25686e, "gcmSenderId");
        a9i0VarM62936D.m25120b(this.f25687f, "storageBucket");
        a9i0VarM62936D.m25120b(this.f25688g, "projectId");
        return a9i0VarM62936D.toString();
    }
}
