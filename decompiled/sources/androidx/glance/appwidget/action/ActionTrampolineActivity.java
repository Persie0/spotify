package androidx.glance.appwidget.action;

import android.app.Activity;
import android.os.Bundle;
import kotlin.Metadata;
import p204p.wqg1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Landroidx/glance/appwidget/action/ActionTrampolineActivity;", "Landroid/app/Activity;", "<init>", "()V", "glance-appwidget_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class ActionTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wqg1.m88757H(this, getIntent());
        finish();
    }
}
