package p204p;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.highlightsstats.statsdetails.uiusecases.bubblegraph.BubbleView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class gpa extends ConstraintLayout {

    /* JADX INFO: renamed from: R0 */
    public final fpa[] f83117R0;

    /* JADX INFO: renamed from: S0 */
    public List f83118S0;

    public gpa(Context context) {
        super(context, null, 0, 0);
        this.f83118S0 = lau.f131415a;
        View.inflate(context, R.layout.bubble_graph_view, this);
        this.f83117R0 = new fpa[]{new fpa((TextView) mec1.m61562n(this, R.id.label_one), (TextView) mec1.m61562n(this, R.id.text_one), (BubbleView) mec1.m61562n(this, R.id.bubble_one)), new fpa((TextView) mec1.m61562n(this, R.id.label_two), (TextView) mec1.m61562n(this, R.id.text_two), (BubbleView) mec1.m61562n(this, R.id.bubble_two)), new fpa((TextView) mec1.m61562n(this, R.id.label_three), (TextView) mec1.m61562n(this, R.id.text_three), (BubbleView) mec1.m61562n(this, R.id.bubble_three)), new fpa((TextView) mec1.m61562n(this, R.id.label_four), (TextView) mec1.m61562n(this, R.id.text_four), (BubbleView) mec1.m61562n(this, R.id.bubble_four))};
    }

    public final List<epa> getBubbleData() {
        return this.f83118S0;
    }

    public final void setBubbleData(List<epa> list) {
        float f;
        this.f83118S0 = list;
        c7j c7jVar = new c7j();
        c7jVar.m31736f(this);
        List list2 = this.f83118S0;
        fpa[] fpaVarArr = this.f83117R0;
        int length = fpaVarArr.length;
        ArrayList<pqm0> arrayList = new ArrayList(Math.min(i6f.m49804T(list2, 10), length));
        int i = 0;
        for (Object obj : list2) {
            if (i >= length) {
                break;
            }
            arrayList.add(new pqm0(obj, fpaVarArr[i]));
            i++;
        }
        for (pqm0 pqm0Var : arrayList) {
            epa epaVar = (epa) pqm0Var.f180350a;
            fpa fpaVar = (fpa) pqm0Var.f180351b;
            int iM38547C = edb.m38547C(epaVar.f61595c);
            if (iM38547C == 0) {
                f = 0.17f;
            } else if (iM38547C == 1) {
                f = 0.21f;
            } else if (iM38547C == 2) {
                f = 0.26f;
            } else {
                if (iM38547C != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 0.36f;
            }
            BubbleView bubbleView = fpaVar.f71781c;
            TextView textView = fpaVar.f71780b;
            bubbleView.setBubbleColors(new kpa(Color.parseColor(epaVar.f61596d), m9f.m61224l(Color.parseColor(epaVar.f61597e), 127)));
            c7jVar.m31740l(bubbleView.getId()).f258686e.f269816V = f;
            if (epaVar.f61595c == 4) {
                c7jVar.m31740l(bubbleView.getId()).f258684c.f13063d = 1.0f;
                textView.setTextAppearance(getContext(), R.style.TextAppearance_Encore_TitleSmall);
            } else {
                c7jVar.m31740l(bubbleView.getId()).f258684c.f13063d = 0.3f;
            }
            textView.setText(epaVar.f61594b);
            fpaVar.f71779a.setText(epaVar.f61593a);
        }
        c7jVar.m31733b(this);
    }
}
