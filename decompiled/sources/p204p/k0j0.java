package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class k0j0 implements j1j0 {

    /* JADX INFO: renamed from: a */
    public static final k0j0 f118115a = new k0j0();

    /* JADX INFO: renamed from: b */
    public static final String f118116b;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        f118116b = xgg1.m90725W1().f36166c;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public final String mo24455a() {
        return f118116b;
    }

    @Override // p204p.j1j0
    public final String getUri() {
        return WidgetInteraction.Background.DESTINATION_HOME;
    }
}
