package p204p;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.spotify.transcript.list.TranscriptListView;

/* JADX INFO: loaded from: classes10.dex */
public final class p191 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TranscriptListView f173010a;

    public p191(TranscriptListView transcriptListView) {
        this.f173010a = transcriptListView;
    }

    /* JADX INFO: renamed from: a */
    public final LinearLayoutManager m68781a() {
        AbstractC0110a layoutManager = this.f173010a.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX INFO: renamed from: b */
    public final void m68782b(int i) {
        dkv0 dkv0VarM993M;
        View view;
        LinearLayoutManager linearLayoutManagerM68781a = m68781a();
        TranscriptListView transcriptListView = this.f173010a;
        if (linearLayoutManagerM68781a == null || linearLayoutManagerM68781a.mo923D(i) == null) {
            int height = (transcriptListView.getHeight() - transcriptListView.getPaddingBottom()) / 4;
            LinearLayoutManager linearLayoutManagerM68781a2 = m68781a();
            if (linearLayoutManagerM68781a2 != null) {
                linearLayoutManagerM68781a2.mo962x1(i, height);
                return;
            }
            return;
        }
        int i2 = TranscriptListView.f6894o2;
        if (i < 0) {
            dkv0VarM993M = null;
        } else {
            hjv0 adapter = transcriptListView.getAdapter();
            if (i <= (adapter != null ? adapter.mo1617e() : 0)) {
                dkv0VarM993M = transcriptListView.m993M(i);
            } else {
                dkv0VarM993M = null;
            }
        }
        pqm0 pqm0Var = (dkv0VarM993M == null || (view = dkv0VarM993M.f50039a) == null) ? new pqm0(0, 0) : new pqm0(Integer.valueOf(view.getTop()), Integer.valueOf(view.getMeasuredHeight()));
        transcriptListView.m1040y0(0, Math.max(0, ((Number) pqm0Var.f180350a).intValue() - ((transcriptListView.getHeight() - ((Number) pqm0Var.f180351b).intValue()) / 2)), new AccelerateInterpolator(0.2f), false);
    }
}
