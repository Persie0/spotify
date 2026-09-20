package p204p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public final class ghn0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79951a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f79952b;

    /* JADX INFO: renamed from: c */
    public final RecyclerView f79953c;

    public /* synthetic */ ghn0(RecyclerView recyclerView, RecyclerView recyclerView2, int i) {
        this.f79951a = i;
        this.f79952b = recyclerView;
        this.f79953c = recyclerView2;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f79951a) {
            case 0:
                break;
        }
        return this.f79952b;
    }
}
