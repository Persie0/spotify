package p204p;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class yf50 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f272129a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f272130b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ag50 f272131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf50(Activity activity, ag50 ag50Var, int i) {
        super(0);
        this.f272129a = i;
        this.f272130b = activity;
        this.f272131c = ag50Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f272129a) {
            case 0:
                ag50 ag50Var = this.f272131c;
                String str = ag50Var.f15287b.f243599b;
                Activity activity = this.f272130b;
                ((ClipboardManager) activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(activity.getString(R.string.internal_issue_report_url_clipboard_label), str));
                ag50.m25840a(ag50Var);
                break;
            default:
                Activity activity2 = this.f272130b;
                ag50 ag50Var2 = this.f272131c;
                try {
                    activity2.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", ag50Var2.f15287b.f243599b), null));
                } catch (Exception e) {
                    Logger.m3967c(e, "Failed to share Jira ticket link", new Object[0]);
                }
                ag50.m25840a(ag50Var2);
                break;
        }
        return w2a1.f247311a;
    }
}
