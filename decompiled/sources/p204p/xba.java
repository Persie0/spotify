package p204p;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class xba extends o65 {
    @Override // p204p.ugr
    public final void dismiss() {
        Dialog dialogMo63161j1 = mo63161j1();
        if (dialogMo63161j1 instanceof wba) {
            ((wba) dialogMo63161j1).m87626g().getClass();
        }
        m83052i1(false, false);
    }

    @Override // p204p.ugr
    /* JADX INFO: renamed from: h1 */
    public final void mo83051h1() {
        Dialog dialogMo63161j1 = mo63161j1();
        if (dialogMo63161j1 instanceof wba) {
            ((wba) dialogMo63161j1).m87626g().getClass();
        }
        super.mo83051h1();
    }

    @Override // p204p.o65, p204p.ugr
    /* JADX INFO: renamed from: l1 */
    public Dialog mo25833l1(Bundle bundle) {
        return new wba(m49717p0(), mo33450k1());
    }
}
