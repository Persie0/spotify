package p204p;

import android.view.View;
import android.widget.AdapterView;
import com.spotify.messaging.messagingplatformdebug.items.PriorityPicker;

/* JADX INFO: loaded from: classes8.dex */
public final class oer0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f164517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PriorityPicker f164518b;

    public oer0(gh00 gh00Var, PriorityPicker priorityPicker) {
        this.f164517a = gh00Var;
        this.f164518b = priorityPicker;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f164517a.invoke(ker0.valueOf((String) this.f164518b.f5512a.getAdapter().getItem(i)));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.f164517a.invoke(ker0.DEFAULT);
    }
}
