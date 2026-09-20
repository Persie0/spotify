package p204p;

import android.R;
import android.content.ClipData;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.spotify.login.adaptiveauthentication.challenge.smscode.OtpInputView;

/* JADX INFO: loaded from: classes8.dex */
public final class owl0 implements ActionMode.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ OtpInputView f170733a;

    public owl0(OtpInputView otpInputView) {
        this.f170733a = otpInputView;
    }

    /* JADX INFO: renamed from: a */
    public final String m68173a() {
        ClipData.Item itemAt;
        OtpInputView otpInputView = this.f170733a;
        CharSequence text = null;
        if (!otpInputView.f5295g.hasPrimaryClip()) {
            return null;
        }
        ClipData primaryClip = otpInputView.f5295g.getPrimaryClip();
        if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null) {
            text = itemAt.getText();
        }
        return otpInputView.m13288i(String.valueOf(text));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        String strM68173a = m68173a();
        if (strM68173a == null) {
            return false;
        }
        OtpInputView otpInputView = this.f170733a;
        otpInputView.m13280a(otpInputView.f5296h - 1);
        int i = otpInputView.f5296h;
        for (int i2 = 0; i2 < i; i2++) {
            otpInputView.m13287h(i2, String.valueOf(strM68173a.charAt(i2)));
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (m68173a() == null) {
            return false;
        }
        menu.clear();
        menu.add(R.string.paste);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
