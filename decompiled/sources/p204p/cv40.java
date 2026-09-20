package p204p;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class cv40 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dv40 f42291a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv40(InputConnection inputConnection, dv40 dv40Var) {
        super(inputConnection, false);
        this.f42291a = dv40Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        vux vuxVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            vuxVar = new vux(new ev40(inputContentInfo), 16);
        }
        if (this.f42291a.mo37044e(vuxVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
