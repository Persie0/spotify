package p204p;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class kec1 implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a */
    public final cdl0 f121859a;

    public kec1(cdl0 cdl0Var) {
        this.f121859a = cdl0Var;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        lij lijVar = new lij(new t1j(contentInfo));
        lij lijVarMo24851a = this.f121859a.mo24851a(view, lijVar);
        if (lijVarMo24851a == null) {
            return null;
        }
        return lijVarMo24851a == lijVar ? contentInfo : lijVarMo24851a.m59098c();
    }
}
