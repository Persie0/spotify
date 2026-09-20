package p204p;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.puffin.setup.setupflow.manualselect.p136ui.AmbiguousDeviceSelectView;

/* JADX INFO: loaded from: classes10.dex */
public final class d8t0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final AmbiguousDeviceSelectView f46518a;

    /* JADX INFO: renamed from: b */
    public final TextView f46519b;

    /* JADX INFO: renamed from: c */
    public final EncoreButton f46520c;

    /* JADX INFO: renamed from: d */
    public final FindInContextView f46521d;

    /* JADX INFO: renamed from: e */
    public final TextView f46522e;

    public d8t0(AmbiguousDeviceSelectView ambiguousDeviceSelectView, TextView textView, EncoreButton encoreButton, RecyclerView recyclerView, FindInContextView findInContextView, TextView textView2) {
        this.f46518a = ambiguousDeviceSelectView;
        this.f46519b = textView;
        this.f46520c = encoreButton;
        this.f46521d = findInContextView;
        this.f46522e = textView2;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f46518a;
    }
}
