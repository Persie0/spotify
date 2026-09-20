package p204p;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class l4f1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f129675a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Intent f129676b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f129677c;

    public /* synthetic */ l4f1(Intent intent, Object obj, int i) {
        this.f129675a = i;
        this.f129676b = intent;
        this.f129677c = obj;
    }

    /* JADX INFO: renamed from: b */
    public static l4f1 m58140b(GoogleApiActivity googleApiActivity, Intent intent) {
        return new l4f1(intent, googleApiActivity, 0);
    }

    /* JADX INFO: renamed from: c */
    public static l4f1 m58141c(ac80 ac80Var, Intent intent) {
        return new l4f1(intent, ac80Var, 1);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, p.ac80] */
    /* JADX INFO: renamed from: a */
    public final void m58142a() {
        switch (this.f129675a) {
            case 0:
                Intent intent = this.f129676b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f129677c).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.f129676b;
                if (intent2 != null) {
                    this.f129677c.startActivityForResult(intent2, 2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                m58142a();
            } catch (ActivityNotFoundException unused) {
                Build.FINGERPRINT.contains("generic");
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
