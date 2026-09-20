package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.android.MobiusLoopViewModel;

/* JADX INFO: loaded from: classes8.dex */
public final class sz0 implements e9y0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f215354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MobiusLoopViewModel f215355b;

    public /* synthetic */ sz0(MobiusLoopViewModel mobiusLoopViewModel, int i) {
        this.f215354a = i;
        this.f215355b = mobiusLoopViewModel;
    }

    @Override // p204p.e9y0
    /* JADX INFO: renamed from: f */
    public final Bundle mo25168f() {
        switch (this.f215354a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putParcelable("ADAPTIVE_AUTH_VM_STATE_KEY", (Parcelable) this.f215355b.m15622g());
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("VM_STATE_KEY", (Parcelable) this.f215355b.m15622g());
                return bundle2;
            case 2:
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("VM_STATE_KEY", (Parcelable) this.f215355b.m15622g());
                return bundle3;
            case 3:
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("VM_STATE_KEY", (Parcelable) this.f215355b.m15622g());
                return bundle4;
            case 4:
                Bundle bundle5 = new Bundle();
                bundle5.putParcelable("VM_STATE_KEY", (Parcelable) this.f215355b.m15622g());
                return bundle5;
            case 5:
                Bundle bundle6 = new Bundle();
                bundle6.putParcelable("VM_STATE_KEY", (Parcelable) this.f215355b.m15622g());
                return bundle6;
            case 6:
                Bundle bundle7 = new Bundle();
                bundle7.putParcelable("TIMELINE_VM_STATE_KEY", (Parcelable) this.f215355b.m15622g());
                return bundle7;
            default:
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable("VM_STATE_KEY", (Parcelable) this.f215355b.m15622g());
                return bundle8;
        }
    }
}
