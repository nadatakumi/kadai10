package sub;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ken {

    // 都道府県情報を保存するマップ
    private final Map<Integer, String[]> prefectures = new HashMap<>();

    public ken() {
        prefectures.put(0, new String[]{"北海道", "札幌市", "83424"});
        prefectures.put(1, new String[]{"青森県", "青森市", "9646"});
        prefectures.put(2, new String[]{"岩手県", "盛岡市", "15275"});
        prefectures.put(3, new String[]{"宮城県", "仙台市", "7282"});
        prefectures.put(4, new String[]{"秋田県", "秋田市", "11638"});
        prefectures.put(5, new String[]{"山形県", "山形市", "9323"});
        prefectures.put(6, new String[]{"福島県", "福島市", "13784"});
        prefectures.put(7, new String[]{"茨城県", "水戸市", "6097"});
        prefectures.put(8, new String[]{"栃木県", "宇都宮市", "6408"});
        prefectures.put(9, new String[]{"群馬県", "前橋市", "6362"});
        prefectures.put(10, new String[]{"埼玉県", "さいたま市", "3798"});
    }

    // 選択した都道府県を処理して表示するメソッド
    public void processSelections(List<String> selectedNumbers, String sortOrder) {
        List<Integer> selectedIndices = new ArrayList<>();
        for (String number : selectedNumbers) {
            selectedIndices.add(Integer.parseInt(number.trim()));
        }

        // 昇順または降順でソート
        if ("asc".equalsIgnoreCase(sortOrder)) {
            selectedIndices.sort(Comparator.naturalOrder());
        } else if ("desc".equalsIgnoreCase(sortOrder)) {
            selectedIndices.sort(Comparator.reverseOrder());
        }

        // 選択した都道府県情報を表示
        for (Integer index : selectedIndices) {
            String[] info = prefectures.get(index);
            if (info != null) {
                System.out.println("都道府県名：" + info[0]);
                System.out.println("県庁所在地：" + info[1]);
                System.out.println("面積：" + info[2] + "km2");
                System.out.println();
            }
        }
    }
}
