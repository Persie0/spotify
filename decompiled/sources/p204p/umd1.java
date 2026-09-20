package p204p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookDialogException;

/* JADX INFO: loaded from: classes3.dex */
public final class umd1 extends jld1 {

    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ int f231836M0 = 0;

    /* JADX INFO: renamed from: L0 */
    public final String f231837L0;

    public umd1(m500 m500Var, String str, String str2) {
        super(m500Var, str);
        this.f231837L0 = str2;
        this.f113589b = str2;
    }

    @Override // p204p.jld1
    /* JADX INFO: renamed from: c */
    public final Bundle mo53675c(String str) {
        String str2 = this.f231837L0;
        if (str2.length() <= 0 || !bm51.m29803n0(str, str2, false)) {
            return super.mo53675c(str);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            getContext().startActivity(intent);
            dismiss();
        } catch (Exception e) {
            m53677e(new FacebookDialogException("Failed to launch custom redirect: " + e.getMessage(), -1, str));
        }
        return new Bundle();
    }
}
