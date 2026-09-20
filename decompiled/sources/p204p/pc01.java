package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0110a;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: classes5.dex */
public final class pc01 implements hr91 {

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Controller f175925a;

    /* JADX INFO: renamed from: b */
    public final pcw f175926b;

    /* JADX INFO: renamed from: c */
    public final wg61 f175927c = new wg61(new oc01(this));

    public pc01(MobiusLoop.Controller controller, pcw pcwVar) {
        this.f175925a = controller;
        this.f175926b = pcwVar;
    }

    @Override // p204p.hr91
    public final Object getView() {
        return (View) this.f175927c.getValue();
    }

    @Override // p204p.hr91
    public final Bundle serialize() {
        Parcelable parcelableMo963y0;
        Bundle bundle = new Bundle();
        AbstractC0110a layoutManager = ((bwt0) ((kz5) this.f175926b.f176243b).f128012b).m30720u().getLayoutManager();
        if (layoutManager != null && (parcelableMo963y0 = layoutManager.mo963y0()) != null) {
            bundle.putParcelable("SettingsPageViewBinderImpl.savedState", parcelableMo963y0);
        }
        return bundle;
    }

    @Override // p204p.hr91
    public final void start() {
        pcw pcwVar = this.f175926b;
        MobiusLoop.Controller controller = this.f175925a;
        controller.mo15604c(pcwVar);
        controller.start();
    }

    @Override // p204p.hr91
    public final void stop() {
        MobiusLoop.Controller controller = this.f175925a;
        controller.stop();
        controller.disconnect();
    }
}
