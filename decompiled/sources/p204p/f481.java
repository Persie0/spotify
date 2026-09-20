package p204p;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class f481 implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if ((view instanceof TextView) && !TextUtils.isEmpty(((TextView) view).getText())) {
            return false;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        view.getLocationOnScreen(iArr);
        view.getWindowVisibleDisplayFrame(rect);
        Context context = view.getContext();
        int width = view.getWidth();
        int height = view.getHeight();
        int i = (height / 2) + iArr[1];
        int i2 = (width / 2) + iArr[0];
        WeakHashMap weakHashMap = mec1.f142677a;
        if (view.getLayoutDirection() == 0) {
            i2 = context.getResources().getDisplayMetrics().widthPixels - i2;
        }
        Toast toastMakeText = Toast.makeText(context, view.getContentDescription(), 0);
        if (i < rect.height()) {
            toastMakeText.setGravity(8388661, i2, (iArr[1] + height) - rect.top);
        } else {
            toastMakeText.setGravity(81, 0, height);
        }
        toastMakeText.show();
        return true;
    }
}
