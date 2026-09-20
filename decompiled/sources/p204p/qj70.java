package p204p;

import android.app.Activity;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes.dex */
public final class qj70 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f189172a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f189173b;

    /* JADX INFO: renamed from: c */
    public final e940 f189174c;

    /* JADX INFO: renamed from: d */
    public final Activity f189175d;

    /* JADX INFO: renamed from: e */
    public final IconCompat f189176e;

    /* JADX INFO: renamed from: f */
    public final wg61 f189177f = new wg61(new ag70(this, 2));

    public qj70(Activity activity, Scheduler scheduler, Scheduler scheduler2, e940 e940Var) {
        this.f189172a = scheduler;
        this.f189173b = scheduler2;
        this.f189174c = e940Var;
        this.f189175d = activity;
        this.f189176e = IconCompat.m392f(activity, R.mipmap.shortcut_icon_lastvisitedpage_placeholder);
    }
}
