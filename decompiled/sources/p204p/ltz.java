package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class ltz implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136932a;

    /* JADX INFO: renamed from: b */
    public final b2s0 f136933b;

    /* JADX INFO: renamed from: c */
    public final Set f136934c;

    public ltz(b2s0 b2s0Var, int i) {
        this.f136932a = i;
        switch (i) {
            case 1:
                this.f136933b = b2s0Var;
                this.f136934c = Collections.singleton(gn80.PROFILE_COMPLETION_SHEET);
                break;
            default:
                this.f136933b = b2s0Var;
                this.f136934c = Collections.singleton(gn80.MUTUAL_FOLLOW_SEND_MESSAGE_SHEET);
                break;
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        switch (this.f136932a) {
            case 0:
                break;
        }
        return this.f136934c;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        switch (this.f136932a) {
            case 0:
                return itz.class;
            default:
                return iqr0.class;
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        switch (this.f136932a) {
            case 0:
                String stringExtra = intent.getStringExtra("user-name");
                if (stringExtra != null) {
                    return new ktz(stringExtra, intent.getStringExtra("dm-hierarchy-uri"));
                }
                throw new IllegalArgumentException("username is required for FollowBackMessageInviteSheetPage");
            default:
                String stringExtra2 = intent.getStringExtra("profile_completion_username");
                if (stringExtra2 == null) {
                    throw new IllegalArgumentException("username is required for ProfileCompletionSheetPage");
                }
                String stringExtra3 = intent.getStringExtra("profile_completion_display_name");
                if (stringExtra3 == null) {
                    stringExtra3 = "";
                }
                String str = stringExtra3;
                String stringExtra4 = intent.getStringExtra("profile_completion_profile_pic");
                boolean booleanExtra = intent.getBooleanExtra("profile_completion_is_wrapped", false);
                String stringExtra5 = intent.getStringExtra("profile_completion_feature_identifier");
                if (stringExtra5 == null) {
                    stringExtra5 = "UNKNOWN";
                }
                String str2 = stringExtra5;
                String stringExtra6 = intent.getStringExtra("profile_completion_session_id");
                if (stringExtra6 != null) {
                    return new kqr0(stringExtra2, str, stringExtra4, str2, booleanExtra, stringExtra6);
                }
                throw new IllegalArgumentException("sessionId is required for ProfileCompletionSheetPage");
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: e */
    public final zzq0 mo24414e() {
        switch (this.f136932a) {
            case 0:
                break;
        }
        return new wzq0(false);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        switch (this.f136932a) {
            case 0:
                return "A bottom sheet that invites the user to send a message to someone who followed them back";
            default:
                return "A bottom sheet for the profile completion flow using Page API";
        }
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        switch (this.f136932a) {
            case 0:
                return this.f136933b.f22687a.m58280m();
            default:
                return this.f136933b.f22687a.m58284q();
        }
    }
}
