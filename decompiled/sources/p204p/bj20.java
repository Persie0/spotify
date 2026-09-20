package p204p;

import android.R;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public class bj20 extends wi20 {

    /* JADX INFO: renamed from: c */
    public final TextView f27599c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj20(View view, int i) {
        super(view);
        switch (i) {
            case 1:
                super(view);
                TextView textView = (TextView) view.findViewById(R.id.text2);
                this.f27599c = textView;
                TextView[] textViewArr = {textView};
                eng1.m39510t(textViewArr);
                eng1.m39509s(textViewArr);
                eng1.m39508r(view);
                break;
            default:
                this.f27599c = (TextView) view.findViewById(R.id.text2);
                break;
        }
    }
}
