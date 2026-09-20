package p204p;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class v951 extends View {

    /* JADX INFO: renamed from: a */
    public final GestureDetector f238855a;

    /* JADX INFO: renamed from: b */
    public gh00 f238856b;

    /* JADX INFO: renamed from: c */
    public boolean f238857c;

    public v951(Activity activity) {
        super(activity);
        this.f238855a = new GestureDetector(getContext(), new k12(this, 1));
        setId(R.id.storytelling_container_background_controls);
    }

    /* JADX INFO: renamed from: a */
    public final void m84944a(cc51 cc51Var) {
        gh00 gh00Var = this.f238856b;
        if (gh00Var != null) {
            gh00Var.invoke(cc51Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f238857c && motionEvent.getAction() == 0) {
            m84944a(cc51.f36316a);
            this.f238857c = true;
        }
        if (this.f238857c && 1 == motionEvent.getAction()) {
            m84944a(cc51.f36317b);
            this.f238857c = false;
        }
        if (this.f238855a.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setStoryGestureListener(gh00 gh00Var) {
        this.f238856b = gh00Var;
    }
}
