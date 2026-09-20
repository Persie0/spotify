package androidx.mediarouter.app;

import android.view.View;

/* JADX INFO: renamed from: androidx.mediarouter.app.a */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC0109a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MediaRouteExpandCollapseButton f1149a;

    public ViewOnClickListenerC0109a(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.f1149a = mediaRouteExpandCollapseButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.f1149a;
        boolean z = mediaRouteExpandCollapseButton.f1144h;
        mediaRouteExpandCollapseButton.f1144h = !z;
        if (z) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f1141e);
            mediaRouteExpandCollapseButton.f1141e.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f1142f);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f1140d);
            mediaRouteExpandCollapseButton.f1140d.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f1143g);
        }
        View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.f1145i;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
