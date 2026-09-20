package p204p;

import android.view.View;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;

/* JADX INFO: loaded from: classes3.dex */
public final class gpe0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83176a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MessageInputView f83177b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f83178c;

    public /* synthetic */ gpe0(MessageInputView messageInputView, String str, int i) {
        this.f83176a = i;
        this.f83177b = messageInputView;
        this.f83178c = str;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r3v5, types: [p.gh00, p.qe70] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f83176a) {
            case 0:
                this.f83177b.f2750T0.invoke(new voe0(this.f83178c));
                break;
            default:
                this.f83177b.f2750T0.invoke(new xoe0(this.f83178c));
                break;
        }
    }
}
