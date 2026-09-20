package p204p;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface xi80 {
    /* JADX INFO: renamed from: a */
    default float mo91106a(ViewGroup viewGroup, List list, View view) {
        return view.getTranslationX();
    }

    /* JADX INFO: renamed from: b */
    default float mo91107b(ViewGroup viewGroup, ArrayList arrayList, View view) {
        return view.getTranslationY();
    }
}
