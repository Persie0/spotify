package com.spotify.intentrouter.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p204p.o2d0;
import p204p.pnx0;
import p204p.qy7;

/* JADX INFO: loaded from: classes7.dex */
public class MatcherCollisionException extends RuntimeException {
    /* JADX INFO: renamed from: a */
    public static MatcherCollisionException m12028a(pnx0 pnx0Var, List list) {
        ArrayList<o2d0> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((qy7) it.next()).f193840a);
        }
        StringBuilder sb = new StringBuilder("Collision found for the input: ");
        sb.append(pnx0Var);
        sb.append("\n  Colliding matchers:");
        for (o2d0 o2d0Var : arrayList) {
            sb.append("\n    ");
            sb.append(o2d0Var.description());
        }
        return new MatcherCollisionException(sb.toString());
    }
}
