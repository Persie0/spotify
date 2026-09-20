package p204p;

import android.view.RenderNode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fkw0 {
    /* JADX INFO: renamed from: a */
    public static int m41934a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    /* JADX INFO: renamed from: b */
    public static int m41935b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    /* JADX INFO: renamed from: c */
    public static void m41936c(RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    /* JADX INFO: renamed from: d */
    public static void m41937d(RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }
}
